package dicex;

public class Dictionary {

	private static String kor[] = {"사람", "아기", "돈", "미래", "희망"};
	private static String eng[] = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		
		
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word))
				return eng[i]; // 워드를 찾았으면 인덱스 i의 영어단어를 리턴
		}
		return null; // 내가 입력한 단어가 없으면 null 리턴
	}
}
