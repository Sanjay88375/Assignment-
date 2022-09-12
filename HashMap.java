import java.util.*;
public class HashMapKey {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Map<Integer,Integer> map = new HashMap<>();
			for(int i = 1;i<=15;i++) {
				map.put(i, i*i);
			}
			System.out.println(map);
		}
}
