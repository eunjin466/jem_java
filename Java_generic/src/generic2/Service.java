package generic2;

public class Service<T> {
	
	public void drink( Bottle<? extends Alcohol> soju ) { //알코올 섭취
		System.out.println( soju.item );
		System.out.println( "한잔 마신다." );
	}

//	public void drink (Bottle<Makgeolli> mak) {
//		System.out.println( mak.item );
//		System.out.println("한잔 마신다.");
//	}
}
