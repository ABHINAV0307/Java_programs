          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
     class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode temp=head;
            while(temp!=null){
                if(head.val==val){
                    head=head.next;
                }

                else if(temp.next!=null){
                    if(temp.next.next==null&&temp.next.val==val){
                        temp.next=null;
                    }
                    else if((temp.val==val)){
                        temp.val=temp.next.val;
                        temp.next=temp.next.next;
                        if(temp.val==val){
                            temp.val=temp.next.val;
                            temp.next=temp.next.next;
                        }
                    }
                }

                temp=temp.next;


            }
            return head;
        }
    }

