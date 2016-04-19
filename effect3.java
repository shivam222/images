import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.io.*;
import javax.imageio.*;
import java.io.File;

class effect1  
{
	
	JFrame fr=new JFrame();
	JPanel p1=new JPanel();
    JPanel p2=new JPanel();
	JButton b1=new JButton("unique");
    JButton b2=new JButton("shade");
	JButton b3=new JButton("bright");
	JButton b4=new JButton("loop");
	JButton b5=new JButton("Save");
	JButton b6=new JButton("compress");
	JLabel imageLabel1 = new JLabel();
	JLabel imageLabel2 = new JLabel();
	JLabel imageLabel3 = new JLabel();
	JLabel imageLabel4 = new JLabel();
	JLabel imageLabel5 = new JLabel();
	int last=0;
	FileWriter writer;
	File pixel;

	public effect1()
	{
		fr.setSize(1000,1000);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("IMAGE EFFECTS");
		fr.setLayout(new BorderLayout());
		
		p2.setLayout(new GridLayout(0,4,2,2));
		
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b6);
        p2.add(b5);
		fr.add(p1,BorderLayout.NORTH);
	    fr.add(p2,BorderLayout.SOUTH);

    }
	public void effect2()
	{
		
		JFileChooser fc=new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("E:/zayn"));
		fc.setDialogTitle("Choose your Image");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
        fc.setFileFilter(filter);
		fr.add(fc);
		
	     int returnVal = fc.showOpenDialog(fr);          
        if(returnVal == JFileChooser.APPROVE_OPTION)
			{
				
                ImageIcon image = new ImageIcon(fc.getSelectedFile().getAbsolutePath());
				
                imageLabel1.setIcon(image);
                 				
                p1.add(imageLabel1);
			    imageLabel1.setVisible(true);
				fr.setVisible(true);
				
				
				BufferedImage work1 = new BufferedImage(
                image.getIconWidth(),
                image.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
                Graphics g = work1.createGraphics();
                // paint the Icon to the BufferedImage.
               image.paintIcon(null, g, 0,0);
                g.dispose();

				BufferedImage work2 = new BufferedImage(
                image.getIconWidth(),
                image.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
                Graphics g2 = work2.createGraphics();
                // paint the Icon to the BufferedImage.
               image.paintIcon(null, g2, 0,0);
                g2.dispose();

				BufferedImage work3 = new BufferedImage(
                image.getIconWidth(),
                image.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
                Graphics g3 = work3.createGraphics();
                // paint the Icon to the BufferedImage.
               image.paintIcon(null, g3, 0,0);
                g3.dispose();

				BufferedImage work4 = new BufferedImage(
                image.getIconWidth(),
                image.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
                Graphics g4 = work4.createGraphics();
                // paint the Icon to the BufferedImage.
               image.paintIcon(null, g4, 0,0);
                g4.dispose();
				
				BufferedImage work5 = new BufferedImage(
                image.getIconWidth(),
                image.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
                Graphics g5 = work5.createGraphics();
                // paint the Icon to the BufferedImage.
               image.paintIcon(null, g5, 0,0);
                g5.dispose();
				
				 b2.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {    
				imageLabel1.setVisible(false);
				imageLabel2.setVisible(false);
				imageLabel4.setVisible(false);
				imageLabel5.setVisible(false);
				last=2;
                 int height=work2.getHeight();
                 int width=work2.getWidth();
				 System.out.println(height);
				 System.out.println(width);

				 
                  for(int i=0;i<height-0;i++)
                    {
                        for(int j=0;j<width-0;j++)
                        {
                            Color c= new Color(work2.getRGB(j,i));
                            if(c.getGreen()>150&&c.getBlue()>150&&c.getRed()>150)
                                    {
                                          Color c2=new Color(200,200,200);
                                          int co=c2.getRGB();  
                                          work2.setRGB(j,i,co);
                                    }
                            else
                                       {
                                             Color c3=new Color(c.getRed(),c.getGreen(),c.getBlue());
                                          int cl=c3.getRGB();  
                                          work2.setRGB(j,i,cl);
                                                }
                            
                        }
                    }
					ImageIcon image2 = new ImageIcon(work2);
                    imageLabel3.setIcon(image2);
					
                    p1.add(imageLabel3);
                    imageLabel3.setVisible(true);					
            }
			});

			 b1.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {    
				imageLabel1.setVisible(false);
				imageLabel3.setVisible(false);
				imageLabel4.setVisible(false);
				imageLabel5.setVisible(false);
				last=1;
                 int height=work2.getHeight();
                 int width=work2.getWidth();
				 System.out.println(height);
				 System.out.println(width);

				 
                  for(int i=0;i<height-0;i++)
                    {
                        for(int j=0;j<width-0;j++)
                        {
                            Color c= new Color(work1.getRGB(j,i));
                            if(c.getGreen()<50&&c.getBlue()<50&&c.getRed()<50)
                                    {
                                          Color c2=new Color(112,128,144);
                                          int co=c2.getRGB();  
                                          work1.setRGB(j,i,co);
                                    }
                            else
                                       {
                                             Color c3=new Color(c.getRed(),c.getGreen(),c.getBlue());
                                          int cl=c3.getRGB();  
                                          work1.setRGB(j,i,cl);
                                                }
                            
                        }
                    }
					ImageIcon image2 = new ImageIcon(work1);
                    imageLabel2.setIcon(image2);
					
                    p1.add(imageLabel2);
                    imageLabel2.setVisible(true);					
            }
			});	
			
					  
					  
			b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
				imageLabel1.setVisible(false);
                imageLabel2.setVisible(false);
				imageLabel3.setVisible(false);
				imageLabel4.setVisible(false);					
				imageLabel5.setVisible(false);
                   last=3;				
                 int height=work3.getHeight();
                 int width=work3.getWidth();
                    
                  for(int i=0;i<height-0;i++)
                    {
                        for(int j=0;j<width-0;j++)
                        {
                            Color c= new Color(work3.getRGB(j,i));
                            if(c.getRed()==0)
							{
								Color c2=new Color(0,50,100);
								int co1=c2.getRGB();
							    work3.setRGB(j,i,co1);
							}
                             if(c.getRed()==0&&c.getGreen()==0)
							{
								Color c3=new Color(50,0,0);
								int co2=c3.getRGB();
								work3.setRGB(j,i,co2);
							}
							 if(c.getRed()<20&&c.getGreen()<20)
							{
								Color c4=new Color(0,0,50);
								int co3=c4.getRGB();
								work3.setRGB(j,i,co3);
							}
							if(c.getRed()<200&&c.getGreen()<200&&c.getBlue()<200&&c.getGreen()>100&&c.getRed()>100&&c.getBlue()>100)
							{
								Color c5=new Color(112,128,144);
								int co4=c5.getRGB();
								work3.setRGB(j,i,co4);
							}
							else{
								Color c6=new Color(c.getRed(),c.getGreen(),c.getBlue());
								int co5=c6.getRGB();
							    work3.setRGB(j,i,co5);
							}
                            
                          
                        }
					}
					ImageIcon image2 = new ImageIcon(work3);
                    
                    imageLabel4.setIcon(image2);
					
                    p1.add(imageLabel4);
                    imageLabel4.setVisible(true);					
            }
			});
			b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
				imageLabel1.setVisible(false);
				imageLabel2.setVisible(false);
				imageLabel3.setVisible(false);
				imageLabel4.setVisible(false);
                 last=4;				
				
                 int height=work4.getHeight();
                 int width=work4.getWidth();
                    
                  for(int i=0;i<height-0;i++)
                    {
                        for(int j=0;j<width-0;j++)
                        {     Color c= new Color(work3.getRGB(j,i));
                            if(i<height/3)
							{
								Color c2=new Color(0,c.getGreen(),50);
								int co1=c2.getRGB();
							    work4.setRGB(j,i,co1);
							}
                           else if(i>=height/3&&i<2*height/3)
							{
								Color c3=new Color(c.getRed(),0,50);
								int co2=c3.getRGB();
								work4.setRGB(j,i,co2);
							}
							else if(i>=2*height/3&&i<=height)
							{
								Color c4=new Color(50,0,c.getBlue());
								int co3=c4.getRGB();
								work4.setRGB(j,i,co3);
							}
							
							else{
								Color c6=new Color(c.getRed(),c.getGreen(),c.getBlue());
								int co5=c6.getRGB();
							    work4.setRGB(j,i,co5);
							}
                        }
                    }
					ImageIcon image2 = new ImageIcon(work4);
                    
                    imageLabel5.setIcon(image2);
					
                    p1.add(imageLabel5);
                    imageLabel5.setVisible(true);					
            }
			});		
            
             b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
			
            {
			   if(last==0){
			   
				    System.out.println("Already Saved");
			   }
            if(last==1){
			    try{
				    File output= new File("work1.jpg");
                    ImageIO.write(work1,"jpg",output);
			         }
					catch(Exception e2)
			          {  }	
			   } 
             if(last==2){
			    try{
				    File output= new File("work2.jpg");
                    ImageIO.write(work2,"jpg",output);
			         }
					catch(Exception e2)
			          {  }	
			   }
              if(last==3){
			    try{
				    File output= new File("work3.jpg");
                    ImageIO.write(work3,"jpg",output);
			         }
					catch(Exception e2)
			          {  }	
			   }
               if(last==4){
			    try{
				    File output= new File("work4.jpg");
                    ImageIO.write(work4,"jpg",output);
			         }
					catch(Exception e2)
			          {  }	
			   }			   
            }
			
			
			});
			b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
				int height=work5.getHeight();
				int width=work5.getWidth();
				 
				try{
                             pixel=new File("comp.txt");
						    pixel.createNewFile();
							 writer = new FileWriter(pixel);
							}
              catch(IOException a){}
				
				   
                  for(int i=0;i<3;i++)
                    {
                        for(int j=0;j<3;j++)
                        {   
					       if(i==0&&j==0)
							{
                            Color c= new Color(work5.getRGB(j,i));	
                            Color c2=new Color(c.getRed(),c.getGreen(),c.getGreen());	
                            int co=	c2.getRGB();
						     String cos=Integer.toString(co);
							try{
							writer.write(cos);
							
			   				writer.flush();
							writer.close();
							/*FileReader fr = new FileReader(pixel); 
							char[] data =new char[2];
							fr.read(data); // reads the content to the array
                             for(char f : data)
                                 System.out.print(c);
							      fr.close();*/
							}catch(Exception b){System.out.println(e);}
							}							
							
						}
					}
					
            }
			});		
			
             		
				
			}
		
	}
}	
	class effect3
	{
		public static void main(String str[])
		{
			effect1 ef1=new effect1();
			ef1.effect2();
		}
	}
		
	
	

