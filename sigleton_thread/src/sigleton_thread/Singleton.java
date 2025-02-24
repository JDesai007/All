/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sigleton_thread;

/**
 *
 * @author Jaydip
 */
class Singleton {
    // Volatile ensures visibility and prevents instruction reordering
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created: " + this.hashCode());
    }

    // Double-Checked Locking for Thread-Safety
    public static Singleton getInstance() {
        if (instance == null) {  // First check (without locking)
            synchronized (Singleton.class) {
                if (instance == null) {  // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println(Thread.currentThread().getName() + " using instance: " + this.hashCode());
    }
}
