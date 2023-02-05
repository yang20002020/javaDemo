package ityang;


import java.util.*;
/*

给定一个乱序的数组, 删除所有的重复元素, 使得每个元素只出现一次, 并且按照出现的次数到低进行排序,
相同出现次数按照第一次出现顺序进行先后排序.

输入描述: 一个数组

输出描述: 去重排序后的数组

示例

输入: 1,3,3,3,2,4,4,4,5

输出: 3,4,1,2,5

 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(",");//1,1,2,2,2,3,3,3,3
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < strs.length; i++) {
            int num = Integer.parseInt(strs[i]);
            if (!hm.containsKey(num)) {
                hm.put(num, 1);//key:数值;value:数值的个数
            } else {
                hm.put(num, hm.get(num) + 1);
            }
        }
        System.out.println("hm:"+hm);//hm:{1=2, 2=3, 3=4}
        List<Map.Entry<Integer, Integer>> list = new ArrayList(hm.entrySet());
        System.out.println("list:"+list);//list:[1=2, 2=3, 3=4]
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println("list:"+list);//list:[3=4, 2=3, 1=2]
        List value = new ArrayList();
        for (Map.Entry<Integer, Integer> o : list) {
            value.add(o.getKey());
        }
        for (int i = 0; i < value.size(); i++) {
            if (i == value.size() - 1) {
                System.out.print(value.get(i));
            } else {
                System.out.print(value.get(i) + ",");
            }
        }  //输出3,2,1
    }
}


