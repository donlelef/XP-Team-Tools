package tests;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import model.exceptions.InvalidDateException;
import model.exceptions.NoSuchEventException;

import org.junit.Test;

import timeline.ConcreteTimeline;
import timeline.Event;
import timeline.Timeline;
import filtering.TargetFilter;
import filtering.checkers.NameEventChecker;
import filtering.checkers.ParticipantsEventChecker;
import filtering.checkers.PeriodEventChecker;

public class EventFilteringTests {

	Timeline timeline = new ConcreteTimeline();

	@Test
	public void DateEventFilterTest() throws InvalidDateException {
		timeline.addEvent("Briefing",true, new GregorianCalendar(2020, 02,
				20, 23, 3, 50),null);
		timeline.addEvent("Riunione",true, new GregorianCalendar(2020, 01,
				01, 23, 4, 50),null);
		timeline.addEvent("OtherEvent",true, new GregorianCalendar(2020,
				01, 10, 23, 3, 50),null);
		assertEquals(
				2,
				timeline.getEvents(
						new TargetFilter<Event>(new PeriodEventChecker(
								new GregorianCalendar(2020, 01, 01, 23, 3, 50),
								new GregorianCalendar(2020, 01, 11, 23, 3, 50))))
						.size());
	}

	@Test
	public void participantsEventFilter() throws InvalidDateException, NoSuchEventException {
		timeline.addEvent("Briefing",true, new GregorianCalendar(2020, 02,
				20, 23, 3, 50),null);
		timeline.addEvent("OtherEvent",true, new GregorianCalendar(2020,
				01, 10, 23, 3, 50),null);
		timeline.getEvent(1).addParticipant("Simone");
		timeline.getEvent(1).addParticipant("Alessandro");
		timeline.getEvent(2).addParticipant("Simone");
		assertEquals(
				1,
				timeline.getEvents(
						new TargetFilter<Event>(new ParticipantsEventChecker(
								"Simone", "Alessandro"))).size());
		assertEquals(
				"Briefing",
				timeline.getEvents(
						new TargetFilter<Event>(new ParticipantsEventChecker(
								"Simone", "Alessandro"))).get(0).toString());
		assertEquals(
				0,
				timeline.getEvents(
						new TargetFilter<Event>(new ParticipantsEventChecker(
								"Emanuele"))).size());
	}

	@Test
	public void NameEventFilterTest() throws InvalidDateException {
		timeline.addEvent("Briefing",true, new GregorianCalendar(2020, 02,
				20, 23, 3, 50),null);
		timeline.addEvent("OtherEvent",true, new GregorianCalendar(2020,
				01, 10, 23, 3, 50),null);
		timeline.addEvent("SomeEvent somewhere...",true,
				new GregorianCalendar(2020, 02, 20, 23, 3, 50),null);
		assertEquals(
				2,
				timeline.getEvents(
						new TargetFilter<Event>(new NameEventChecker("Event")))
						.size());
		assertEquals(
				0,
				timeline.getEvents(
						new TargetFilter<Event>(new NameEventChecker("NoSuchString")))
						.size());
		assertEquals(
				"OtherEvent" + "SomeEvent somewhere...",
				timeline.getEvents(
						new TargetFilter<Event>(new NameEventChecker("Event")))
						.get(1).toString()
						+ timeline
								.getEvents(
										new TargetFilter<Event>(
												new NameEventChecker("Event")))
								.get(0).toString());
	}

}
