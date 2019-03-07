
public class ConcessionariaConection {
	protected ConectionBuilder builder;
	public ConcessionariaConection(ConectionBuilder tipo){
		this.builder=tipo;
	}
	
	
	
	public void criarConection(){
		builder.builderBD();
		builder.builderDriver();
		builder.builderURLConection();
	}
	public ConectionBuilder getConection(){
	return this.builder;
}
}
