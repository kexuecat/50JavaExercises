public class _18eighteenth {
	public static void main(String[] args) {
		for(char i='x'; i<='z'; i++){
			for(char j='x'; j<='z'; j++){
				if(i != j)
					for(char k='x'; k<='z'; k++){
						if(i != k && j != k)
							if(i != 'x' && k != 'x' && k != 'z')
								System.out.println("a的对手是:"+i+"\n"+"b的对手是:"+j+"\n"+"c的对手是:"+k+"\n");
					}
			}
		}
	}
}
