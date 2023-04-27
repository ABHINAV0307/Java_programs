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

