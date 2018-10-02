
class Counter{
	private int value=0;
    public Counter(){value=0;}
    public Counter(int v){value=v;}
	public void step(){
		this.value++;
	}
	 
	public int readValue(){
		return this.value;
	}
	public void down() {
		// TODO Auto-generated method stub
		this.value--;
	}
}
