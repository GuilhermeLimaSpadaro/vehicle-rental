package model.entities.subentities;

public class Engine{
	private int wHP;
	private String engineType;

	public Engine(int wHp, String engineType) {
	    this.engineType = engineType;
	    this.wHP = wHp;
	}
	public int getwHP() {
		return wHP;
	}
	public void setwHP(int wHP) {
		this.wHP = wHP;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Engine wHP=" + getwHP() + ", EngineType: " + getEngineType() + ", wHP: ";
	}
	
	
	

	

}
