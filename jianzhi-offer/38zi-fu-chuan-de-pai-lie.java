/*����һ������Ϊ3���ַ����������з�ʽ��3*2*1=6�����з�ʽ
���ַ����д����ظ�Ԫ��ʱ�����з����оͻ�����ظ���������Ҫ�ڹ̶�ĳλ�ַ�ʱ��֤���ַ�ֻ�ڸ�λ�ù̶�һ�Σ���Ϊ��֦
�ݹ������
    ��ֹ������x=len(c)-1������λ�Ѿ��̶��ã����һλֻ��һ��������򽫵�ǰ���cת��Ϊ�ַ������Ҽ��뵽res��
    �ݹ��������ǰ�̶�λx
    �ݹ��壺��ʼ��һ��set�������ų��ظ����ַ�������xλ���ַ��ֱ��i��[x,len(c)]���ַ��������������²�ݹ�
        1.��֦��c[i]��set��
        2.�� c[i] ���� set? ���Ա�֮�������ظ��ַ�ʱ��֦��
        3.�̶��ַ�����c[i]��c[x]����λ�ã��̶�c[i]Ϊ��ǰ�ַ�
        4.�����²�ݹ飺����dfs[x+1],����ʼ�̶���x+1���ַ�
        5.��ԭ������ ���ַ� c[i]��c[x] ��������ԭ֮ǰ�Ľ�����

*/
class Solution {
    List<String> res = new LinkedList<>();
    char[] c;
    public String[] permutation(String s) {
        c=s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);//toArray���б�List�е�Ԫ��ת����Ϊ����
    }

    private void dfs(int x){
        if(x == c.length-1){
            res.add(String.valueOf(c));
            return;
        } 
        HashSet<Character> set = new HashSet<>();
        for(int i=x;i<c.length;i++){
            if(set.contains(c[i]))  continue;//��֦
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    
    }

    private void swap(int a,int b){
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }
}