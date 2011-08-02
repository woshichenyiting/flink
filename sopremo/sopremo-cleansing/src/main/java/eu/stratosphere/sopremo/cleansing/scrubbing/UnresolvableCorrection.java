package eu.stratosphere.sopremo.cleansing.scrubbing;

import org.codehaus.jackson.JsonNode;

import eu.stratosphere.sopremo.EvaluationContext;
import eu.stratosphere.sopremo.cleansing.conflict_resolution.UnresolvableEvalatuationException;

public class UnresolvableCorrection implements ValueCorrection {
	/**
	 * The default, stateless instance.
	 */
	public final static UnresolvableCorrection INSTANCE = new UnresolvableCorrection();

	@Override
	public JsonNode fix(JsonNode contextNode, JsonNode value, ValidationRule voilatedExpression,
			EvaluationContext context) {
		throw new UnresolvableEvalatuationException(String.format("Cannot fix %s voilating %s", value,
			voilatedExpression));
	}
	
}
