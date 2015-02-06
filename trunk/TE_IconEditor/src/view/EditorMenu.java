package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import model.Editor;
import model.tools.Eraser;
import model.tools.Pencil;
import model.tools.SizableBrush;

public class EditorMenu extends JMenuBar{

	private static final long serialVersionUID = 1L;
	
	private Editor editor;

	public EditorMenu(Editor editor) {
		super();
		this.editor = editor;
		this.buildMenu();
	}

	private void buildMenu() {
		
		JMenu dimensionMenu = new JMenu("Dimension");
		
		JMenuItem small = new JMenuItem("16 x 16");
		small.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setIconDimension(16);				
			}
		});
		
		dimensionMenu.add(small);
		
		JMenuItem medium = new JMenuItem("32 x 32");
		medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setIconDimension(32);				
			}
		});
		
		dimensionMenu.add(medium);
		
		JMenuItem large = new JMenuItem("64 x 64");
		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setIconDimension(64);				
			}
		});
		
		dimensionMenu.add(large);
		
		JMenu toolsMenu = new JMenu("Tools");
		
		JMenuItem pencil = new JMenuItem("Pencil");
		pencil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setCurrentTool(new Pencil(editor));
			}
		});
		toolsMenu.add(pencil);
		
		JMenuItem eraser = new JMenuItem("Eraser");
		eraser.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setCurrentTool(new Eraser(editor));
			}
		});
		toolsMenu.add(eraser);
		
		JMenu brush = new JMenu("Brush");
		
		JMenuItem smallbrush = new JMenuItem("Thin");
		smallbrush.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				editor.setCurrentTool(new SizableBrush(editor, 1));				
			}
		});
		JMenuItem mediumBrush = new JMenuItem("Wide");
		mediumBrush.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				editor.setCurrentTool(new SizableBrush(editor, 2));				
			}
		});
		JMenuItem bigBrush = new JMenuItem("Very Wide");
		bigBrush.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				editor.setCurrentTool(new SizableBrush(editor, 3));				
			}
		});
		JMenuItem destructiveBrush = new JMenuItem("Destructive");
		destructiveBrush.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				editor.setCurrentTool(new SizableBrush(editor, 8));				
			}
		});
	
		brush.add(smallbrush);
		brush.add(mediumBrush);
		brush.add(bigBrush);
		brush.add(destructiveBrush);
		
		toolsMenu.add(brush);
		
		JMenu colorMenu = new JMenu("Colors");
		
		JMenuItem black = new JMenuItem("Black");
		black.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setCurrentColor(Color.BLACK);				
			}
		});
		colorMenu.add(black);
		
		JMenuItem blue = new JMenuItem("Blue");
		blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setCurrentColor(Color.BLUE);				
			}
		});
		colorMenu.add(blue);
		
		JMenuItem red = new JMenuItem("Red");
		red.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setCurrentColor(Color.RED);				
			}
		});
		colorMenu.add(red);
		
		JMenuItem yellow = new JMenuItem("Yellow");
		yellow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setCurrentColor(Color.YELLOW);				
			}
		});
		colorMenu.add(yellow);
		
		JMenuItem green = new JMenuItem("Green");
		green.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setCurrentColor(Color.GREEN);				
			}
		});
		colorMenu.add(green);
		
		this.add(colorMenu);
		this.add(toolsMenu);
		this.add(dimensionMenu);
	}
}
