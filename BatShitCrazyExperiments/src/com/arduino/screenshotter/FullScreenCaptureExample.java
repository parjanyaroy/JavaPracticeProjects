package com.arduino.screenshotter;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
 
/**
 * This program demonstrates how to capture a screenshot (full screen)
 * as an image which will be saved into a file.
 * @author www.codejava.net
 *
 */
public class FullScreenCaptureExample {
 
    public static void main(String[] args) throws InterruptedException {
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "FullScreenshot." + format;
             Thread.sleep(3000);
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            Color averageColor = averageColor(screenFullImage, 0, 0, Toolkit.getDefaultToolkit().getScreenSize().getWidth(), Toolkit.getDefaultToolkit().getScreenSize().getHeight());
            ImageIO.write(screenFullImage, format, new File(fileName));
             
            System.out.println("A full screenshot saved!");
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }
    

	public static Color averageColor(BufferedImage bi, int x0, int y0, double w,double h) {
        int x1 = (int) (x0 + w);
        int y1 = (int) (y0 + h);
        long sumr = 0, sumg = 0, sumb = 0;
        for (int x = x0; x < x1; x++) {
            for (int y = y0; y < y1; y++) {
                Color pixel = new Color(bi.getRGB(x, y));
                sumr += pixel.getRed();
                sumg += pixel.getGreen();
                sumb += pixel.getBlue();
            }
        }
        int num = (int) (w * h);
        System.out.println("rgb("+sumr/num+","+sumg/num+","+sumb/num+")");
        return null;
        //return new Color(sumr / num, sumg / num, sumb / num);
    }
}