
public abstract class ConectionBuilder {
	
	protected Conection conection;
	public ConectionBuilder(){
		this.conection=new Conection();
	}
	
public abstract void builderDriver();
public abstract void builderURLConection();
public abstract void builderBD();




	

}
