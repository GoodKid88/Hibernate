//package org.example.model;
//
//import javax.persistence.*;
//@Entity
//@Table(name = "School")
//public class School {
//        @Id
//        @Column(name = "id")
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private int id;
//
//        @Column(name = "school_number")
//        private int school_number;
//        @OneToOne
//        @JoinColumn(name = "principal_id", referencedColumnName = "id")
//        private Principal principal;
//
//
//        public School(int school_number, Principal principal) {
//                this.school_number = school_number;
//                this.principal = principal;
//        }
//
//        public School() {
//
//        }
//
//
//        public int getId() {
//                return id;
//        }
//
//        public void setId(int id) {
//                this.id = id;
//        }
//
//        public int getSchool_number() {
//                return school_number;
//        }
//
//        public void setSchool_number(int school_number) {
//                this.school_number = school_number;
//        }
//
//        public Principal getPrincipal() {
//                return principal;
//        }
//
//        public void setPrincipal(Principal principal) {
//                this.principal = principal;
//        }
//
//        @Override
//        public String toString() {
//                return "School =" + school_number +
//                        "," + principal;
//        }
//}
