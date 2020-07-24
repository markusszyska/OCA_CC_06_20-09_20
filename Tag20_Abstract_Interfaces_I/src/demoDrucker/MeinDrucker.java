package demoDrucker;

public class MeinDrucker implements IDrucker{

	@Override
	public void drucken() {
		// TODO Auto-generated method stub
		
	}

}

class MeinScanner implements IScanner{
	@Override
	public void scannen() {
		// TODO Auto-generated method stub
		
	}	
}
class ImplementiertScannerUndDrucker implements IScanner, IDrucker{

	@Override
	public void drucken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scannen() {
		// TODO Auto-generated method stub
		
	}
	
}


class Combigeraet implements IKombigeraet{

	@Override
	public void drucken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scannen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kopieren() {
		// TODO Auto-generated method stub
		
	}
	
}