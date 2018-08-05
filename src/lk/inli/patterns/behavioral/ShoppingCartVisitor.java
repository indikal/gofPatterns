package lk.inli.patterns.behavioral;

public interface ShoppingCartVisitor {

	int visit(Book book);

	int visit(Fruit fruit);
}