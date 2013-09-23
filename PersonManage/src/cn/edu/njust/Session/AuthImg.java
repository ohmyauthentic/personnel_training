package cn.edu.njust.Session;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class AuthImg  extends HttpServlet{
	
	private final Font mfront=new Font("Times New Roman",Font.PLAIN,18);
	private final int IMG_WIDTH=70;
	private final int IMG_HEIGHT=22;
	
	private Color getRandColor(int fc,int bc){
		Random random=new Random();
		if(fc>255) fc=255;
		if(bc>255) bc=255;
		int r=fc+random.nextInt(bc-fc); 
		int g=fc+random.nextInt(bc-fc);
		int b=fc+random.nextInt(bc-fc);
		return new Color(r,g,b);
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setHeader("Pragma", "No-cache");
		res.setHeader("Cache-Control","No-cache" );
		res.setDateHeader("Expires", 0);
		res.setContentType("image/jpeg");
		BufferedImage  image=new BufferedImage(IMG_WIDTH, IMG_HEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics g=image.getGraphics();		
		Random random=new Random();
		g.setColor(getRandColor(200,250));
		//
		g.fillRect(0, 0, IMG_WIDTH-1, IMG_HEIGHT-1);
		//
		g.setColor(new Color(102,102,102));
		g.drawRect(0, 0, IMG_WIDTH-1, IMG_HEIGHT-1);
		g.setColor(getRandColor(160, 200));
		//
		for(int i=0;i<80;i++){
			int x=random.nextInt(IMG_WIDTH-1);
			int y=random.nextInt(IMG_HEIGHT-1);
			int x1=random.nextInt(6)+1;
			int y1=random.nextInt(12)+1;
			g.drawRect(x, y, x1,y1);
		}
		g.setColor(getRandColor(160,200));
		//
		for(int i=0;i<80;i++){
			int x=random.nextInt(IMG_WIDTH-1);
			int y=random.nextInt(IMG_HEIGHT-1);
			int x1=random.nextInt(6)+1;
			int y1=random.nextInt(12)+1;
			g.drawRect(x, y, x1,y1);
		}
		g.setFont(mfront);
		String sRand="";
		for(int i=0;i<4;i++){
			String tmp=getRandomStr();
			sRand+=tmp;
			g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));
			g.drawString(tmp, 15*i+10,15 );
		}
		HttpSession session=req.getSession(true);
		session.setAttribute("rand", sRand);
		g.dispose();
		ServletOutputStream outputStream= res.getOutputStream();
		JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(outputStream);
		encoder.encode(image);
		outputStream.close();
		//ImageIO.write(image, "JPEG",);
	}
	private String getRandomStr(){
		int rand=(int)Math.round(Math.random()*2);
		long itmp=0;
		char ctmp='\u0000';
		return  Math.round(Math.random()*9)+"";
		/*
		switch (rand) {
		case 1:
			itmp=Math.round(Math.random()*25+65);
			ctmp=(char)itmp;
			return String.valueOf(ctmp);			
		case  2:
			itmp=Math.round(Math.random()*25+97);
		    ctmp=(char)itmp;
		    return String.valueOf(ctmp);
		default:
			return  Math.round(Math.random()*9)+"";
		}*/
		
	}

}
