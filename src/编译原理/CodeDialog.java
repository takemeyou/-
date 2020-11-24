package 编译原理;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CodeDialog  extends Reader{

	private String Buffer = null;
	private int pos = 0;
	
	
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		if(Buffer == null) {
			String in = showDialog();
			if(in == null)
				return -1;
			else {
				//System.out.println(in);
				print(in);//为什么要写个print方法？？直接写sout不好吗？
				Buffer = in + "\n";
				pos = 0;
			}
		}
		int size = 0;
		int length = Buffer.length();
		while(pos < length && size < len)
			cbuf[off+size++] = Buffer.charAt(pos++);
		if(pos == length)
			Buffer = null;
		return size;
	}

	private String showDialog() {
		JTextArea area = new JTextArea(20,40);
		JScrollPane pane = new JScrollPane(area);
		int result = JOptionPane.showConfirmDialog(null, pane,"input",
				JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null);
		if(result == JOptionPane.OK_CANCEL_OPTION)
			return area.getText();
		else
			return null;
	}
	
	public static Reader file() throws FileNotFoundException{
		JFileChooser chooser = new JFileChooser();
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			return new BufferedReader(new FileReader(chooser.getSelectedFile()));
		else
			throw new FileNotFoundException();
	}

	protected void print(String s) {
		System.out.println(s);
	}
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
