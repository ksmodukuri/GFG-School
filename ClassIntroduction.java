package gfg.school;

public class ClassIntroduction {
	
	public static void main(String[] args) {
		Task task = new Task();
		task.setHeight(10);
		task.setWidth(4);
		task.setLength(2);
		System.out.println("Volume " + task.volume());
	}

}

class Task {
	
	private int length;
	
	private int width;
	
	private int height;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int volume() {
		return this.length * this.width * this.height;
	}
}
