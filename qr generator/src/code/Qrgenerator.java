package code;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.image.ImageType;

public class Qrgenerator {

	public static void main(String[] args) throws Exception {
		String S="Kiran";
				ByteArrayOutputStream out=net.glxn.qrgen.QRCode.from(S).to(ImageType.JPG).stream();
		        File file = new File("E:\\kiran.JPG");
		        FileOutputStream outputStream = new FileOutputStream(file);
                outputStream.write(out.toByteArray());
                outputStream.flush();
	}

}
