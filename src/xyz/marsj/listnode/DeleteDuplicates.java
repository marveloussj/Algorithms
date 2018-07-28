package xyz.marsj.listnode;
/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
	示例 1:
	输入: 1->1->2
	输出: 1->2
 * @author sj
 *
 */
public class DeleteDuplicates {
	  public ListNode deleteDuplicates(ListNode head) {
		  ListNode cur=head;
	      while(cur!=null&&cur.next!=null){
	    	  if(cur.val==cur.next.val){
	    		  cur.next=cur.next.next;
	    	  }else{	    		  
	    		  cur=cur.next;
	    	  }
	  }
		return head;
	  }
}