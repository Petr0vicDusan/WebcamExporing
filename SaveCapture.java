package webcamTutorial;


import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

import com.github.sarxos.webcam.WebcamResolution;


public class SaveCapture {


	public static void main(String[] args) throws IOException {
		
		//declares what the allowed resolutions are
		Dimension[] nonStandardResolutions = new Dimension[] {
				WebcamResolution.PAL.getSize(),
				WebcamResolution.HD.getSize(),
				WebcamResolution.FHD.getSize(),
				new Dimension(1080,1080)
			};
		
		Webcam cam = Webcam.getDefault();
		cam.setCustomViewSizes(nonStandardResolutions); //allows non standard resolution
		cam.setViewSize(nonStandardResolutions[3]); //chooses resolution
		cam.open();
		ImageIO.write(cam.getImage(), "PNG", new File("capture4.png"));
	}

}
