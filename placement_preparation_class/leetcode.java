        int value=0;
        int base=1;
        while(l>=0){
            c=  ((s.charAt(l))-64);
            value+=(base*c);
            base*=26;
            l--;
        }
        System.out.println(value);
    }
}
