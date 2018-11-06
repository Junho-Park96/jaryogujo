package course6;

//���� ����Ʈ�� �ܼ� ���� ����Ʈ�� ������ Ŭ����
//���� Ŭ������ ������ ��带 ����Ű�� ������ �߰���
public class MyNewLinkedList {
	private class Node {
		int data;
		Node link;
		Node(int item) {
			data = item;
			link = null;
		}
	}

	private Node head = null; // ����Ʈ�� ù��° ��带 ����Ŵ
	private Node last = null; // ����Ʈ�� ������ ��带 ����Ŵ

	// (1) ù��° ���� item�� �����ϴ� �޼ҵ� - ���� �ð��� O(1) �̾�� ��
	public void addFirst(int item) {
			Node n = new Node(item);
			if(head == null) {
				
			head = n;
			last = n;
			
			}
			else{
				
			n.link = head;
			head = n;
			
			}
		}

	// (2) ������ ���� item�� �����ϴ� �޼ҵ� - ���� �ð��� O(1) �̾�� ��
	public void addLast(int item) { //�������� �Ű������� �޾� ����Ʈ�� �������� ����
		Node t = new Node(item);
		
		if(head == null){
			head = t;
			last = t;
			

		}
		else {
			
			last.link = t;
			last = t;
			
		}
	}

	@Override
	public String toString() {
		String result = "";
		Node tmp = head;
		while(tmp != null) {
			result += tmp.data + " ";
			tmp = tmp.link;
		}
		return result;
	}
}


