package edu.uta.cse.dsc.vm2.math;

import org.evosuite.symbolic.expr.Operator;
import org.evosuite.symbolic.expr.RealExpression;
import org.evosuite.symbolic.expr.RealUnaryExpression;

import edu.uta.cse.dsc.vm2.SymbolicEnvironment;

public final class LOG1P extends MathFunction_D2D {

	private static final String LOG1P = "log1p";

	public LOG1P(SymbolicEnvironment env) {
		super(env, LOG1P);
	}

	@Override
	protected RealExpression executeFunction(double res) {
		Operator op = Operator.LOG1P;
		return new RealUnaryExpression(realExpression, op, res);
	}

}
