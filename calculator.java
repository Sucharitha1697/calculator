
import javax.swing.;

import java.awt.event.;
import java.awt.;

public class Calculator12 implements ActionListener {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
	JTextField t;
	JFrame f;
	 int count=0;
	double a=0,b=0;
	double result=0;
	Calculator12(){
		JFrame f=new JFrame(Calculator);
		
		b1=new JButton(7);
		b2=new JButton(8);
		b3=new JButton(9);
		b4=new JButton();
		b5=new JButton(4);
		b6=new JButton(5);
		b7=new JButton(6);
		b8=new JButton();
		b9=new JButton(1);
		b10=new JButton(2);
		b11=new JButton(3);
		b12=new JButton(-);
		b13=new JButton(.);
		b14=new JButton(0);
		b15=new JButton(=);
		b16=new JButton(+);
		b17=new JButton(delete);
		b18=new JButton(clear);
		t=new JTextField();
		t.setBounds(75,40,200,30);
		b1.setBounds(50,100,50,20);
		b2.setBounds(125,100,50,20);
		b3.setBounds(200,100,50,20);
		b4.setBounds(275,100,50,20);
		b5.setBounds(50,150,50,20);
		b6.setBounds(125,150,50,20);
		b7.setBounds(200,150,50,20);
		b8.setBounds(275,150,50,20);
		b9.setBounds(50,200,50,20);
		b10.setBounds(125,200,50,20);
		b11.setBounds(200,200,50,20);
		b12.setBounds(275,200,50,20);
		b13.setBounds(50,250,50,20);
		b14.setBounds(125,250,50,20);
		b15.setBounds(200,250,50,20);
		b16.setBounds(275,250,50,20);
		b17.setBounds(60,300,100,20);
		b18.setBounds(200,300,100,20);
		f.add(t);
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);
		f.add(b14);f.add(b15);f.add(b16);f.add(b17);f.add(b18);
	f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setResizable(false);
	        
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			t.setText(b1.getText());
		}
		 if(e.getSource()==b2){
			t.setText(b2.getText());
		}
		 if(e.getSource()==b3){
			t.setText(b3.getText());
		}
		 if(e.getSource()==b5){
			t.setText(b5.getText());
		}
		 if(e.getSource()==b6){
			t.setText(b6.getText());
		}
		 if(e.getSource()==b7){
			t.setText(b7.getText());
		}
		 if(e.getSource()==b9){
			t.setText(b9.getText());
		}
		 if(e.getSource()==b10){
			t.setText(b10.getText());
		}
		 if(e.getSource()==b11){
			t.setText(b11.getText());
		}
		 if(e.getSource()==b4){
			  a=Double.parseDouble(t.getText());
			t.setText();
			 count=1;
			
		}
		 if(e.getSource()==b8){
			 
			  a=Double.parseDouble(t.getText());
			 t.setText();
			 count=2;
		}
		  if(e.getSource()==b12){
			 a=Double.parseDouble(t.getText());
			 t.setText();
			 count=3;
		}
		
		 if(e.getSource()==b16){
			  a=Double.parseDouble(t.getText());
			 t.setText();
			 count=4;
		}
		 if(e.getSource()==b15){
			  b=Double.parseDouble(t.getText());
			 
			 switch(count){
			 case 1result=ab;
			        t.setText(+result);
			        break;
			 case 2result=ab;
		        t.setText(String.valueOf(result));
		        break;
			 case 3result=a-b;
		        t.setText(String.valueOf(result));
		        break;
			 case 4result=a+b;
		        t.setText(String.valueOf(result));
		        break;
				 
			 }
		}
		if(e.getSource()==b18){
			 t.setText();
		 }
	}

	public static void main(String[] args) {
		 TODO Auto-generated method stub
		new Calculator12();

	}

}
