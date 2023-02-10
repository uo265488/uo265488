package program.statement;

import program.AbstractASTNode;
import program.expression.Expression;

public class Return extends AbstractASTNode implements Statement {

    public Expression expression;

    public Return(int line, int column, Expression expression) {
        super(line, column);

        this.expression = expression;
    }
}
