package com.example.ptspakaji;

    public class ModelMakanan {

        String nama,desc,desc2,harga;
        int image;

        public ModelMakanan(String nama, String desc, String desc2, String harga, int image){
            this.nama = nama;
            this.desc = desc;
            this.desc2 = desc2;
            this.harga = harga;
            this.image = image;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc2() {
            return desc2;
        }

        public void setDesc2(String desc2) {
            this.desc2 = desc2;
        }

        public String getHarga() {
            return harga;
        }

        public void setHarga(String harga) {
            this.harga = harga;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }
    }

