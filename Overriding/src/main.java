
public class main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] 
				{new Tar�mKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};
	for (BaseKrediManager krediManager : baseKrediManagers) {
		System.out.println(krediManager.hesapla(1000));
	}
	
	
	}

}
