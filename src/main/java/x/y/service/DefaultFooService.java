package x.y.service;

import org.springframework.transaction.interceptor.TransactionAspectSupport;

import x.y.bean.Foo;
import x.y.exceptions.NoProductInStockException;

public class DefaultFooService implements FooService {

	@Override
	public Foo getFoo(String fooName) {
		try {
			throw new NoProductInStockException();
		} catch (NoProductInStockException ex) {

			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			System.out.println("!!!!getting rollback programmactically!!!!");
		}
		return null;

	}

	@Override
	public Foo getFoo(String fooName, String barName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void insertFoo(Foo foo) {
		try {
			throw new NoProductInStockException();
		} catch (NoProductInStockException ex) {

			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			System.out.println("!!!!getting rollback programmactically!!!!");
		}
		
	}

	@Override
	public void updateFoo(Foo foo) {
		throw new UnsupportedOperationException();

	}

}
