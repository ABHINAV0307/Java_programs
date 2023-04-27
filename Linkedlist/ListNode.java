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

