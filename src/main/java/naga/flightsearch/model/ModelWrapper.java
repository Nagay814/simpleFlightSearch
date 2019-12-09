package naga.flightsearch.model;

import lombok.Builder;


@Builder(toBuilder = true)

public class ModelWrapper<ModelType> {
    private ModelType model;
    private boolean noResult;
    private String message;
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (noResult ? 1231 : 1237);
		return result;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelWrapper other = (ModelWrapper) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (noResult != other.noResult)
			return false;
		return true;
	}

	public ModelWrapper() {
	}
    
	public ModelWrapper(ModelType model, boolean noResult, String message) {
		super();
		this.model = model;
		this.noResult = noResult;
		this.message = message;
	}
	@Override
	public String toString() {
		return "ModelWrapper [model=" + model + ", noResult=" + noResult + ", message=" + message + "]";
	}
	/**
	 * @return the model
	 */
	public ModelType getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(ModelType model) {
		this.model = model;
	}
	/**
	 * @return the noResult
	 */
	public boolean isNoResult() {
		return noResult;
	}
	/**
	 * @param noResult the noResult to set
	 */
	public void setNoResult(boolean noResult) {
		this.noResult = noResult;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
    
    
}
