package ch.hsr.servicestoolkit;

public class EngineState {
	private String description;

	public EngineState(String description) {
		this.setDescription(description);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}