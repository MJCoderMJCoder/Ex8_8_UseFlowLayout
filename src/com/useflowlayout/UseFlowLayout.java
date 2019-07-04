package com.useflowlayout;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class UseFlowLayout {

	public static void main(String[] args) {
		//创建窗体
		JFrame frm = new JFrame("使用流布局管理器");
		FlowLayout flowLayout = new FlowLayout();
		frm.setLayout(flowLayout);
		
		JLabel label = new JLabel("性     别：");
		frm.getContentPane().add(label);
		
		ButtonGroup btnGroup = new ButtonGroup();
		JRadioButton manRadioButton = new JRadioButton("男人");
		manRadioButton.setSelected(true);
		JRadioButton womanRadioButton = new JRadioButton("女人");
		btnGroup.add(womanRadioButton); //添加按钮到按钮组中
		btnGroup.add(manRadioButton);
		frm.getContentPane().add(womanRadioButton);
		frm.getContentPane().add(manRadioButton);
		
		frm.setBounds(450, 230, 200, 100);
		frm.setVisible(true);
	}

}
