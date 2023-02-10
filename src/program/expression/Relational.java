package program.expression;

import program.AbstractASTNode;

public class Relational extends AbstractASTNode implements Expression {


    public Expression op1;
    public Expression op2;
    public String operator;

    public Relational(int line, int column, Expression op1, String operator, Expression op2) {
        super(line, column);

        this.op1 = op1;
        this.op2 = op2;
    }
}
