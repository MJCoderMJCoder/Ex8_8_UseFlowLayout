package com.useflowlayout;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class UseFlowLayout {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame("ʹ�������ֹ�����");
		FlowLayout flowLayout = new FlowLayout();
		frm.setLayout(flowLayout);
		
		JLabel label = new JLabel("��     ��");
		frm.getContentPane().add(label);
		
		ButtonGroup btnGroup = new ButtonGroup();
		JRadioButton manRadioButton = new JRadioButton("����");
		manRadioButton.setSelected(true);
		JRadioButton womanRadioButton = new JRadioButton("Ů��");
		btnGroup.add(womanRadioButton); //��Ӱ�ť����ť����
		btnGroup.add(manRadioButton);
		frm.getContentPane().add(womanRadioButton);
		frm.getContentPane().add(manRadioButton);
		
		frm.setBounds(450, 230, 200, 100);
		frm.setVisible(true);
	}

}
