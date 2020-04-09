
/*1.���л��ͷ����л����������ǿ����������ͨ����ǰ�к��������¼�Ķ�������Ϣ�����������ܶ�Ӧ����������������ˣ����л����ַ���ӦЯ�� �������ġ� ��������Ϣ����ӵ�е�����ʾ��������������
2.  node�������е�������n,��node.left������Ϊ2n+1��node.right������Ϊ2n+2
3.  �������У��Զ��������������������Խ��Ҷ�ڵ�� nullnull Ҳ��ӡ������
4. ��rootΪ�գ���ֱ�ӷ��ؿ�����
5. ����queue�����л��б�res
6. ƴ���б��� ',' ��������β��������ţ���
7. �����л�
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        if(root == null) return "[]";
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node != null) {
                res.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            }
            else res.append("null,");
        }
        res.deleteCharAt(res.length() - 1);//ɾ�����Ķ���
        res.append("]");
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");//substring�����ַ��������ַ���������ҿ�
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));//Stringת��Ϊint
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(!vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if(!vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

