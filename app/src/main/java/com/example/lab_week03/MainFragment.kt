// Pastikan baris package ini sesuai dengan proyek Anda
package com.example.lab_week03

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment : Fragment() {

    // Dipanggil saat fragment pertama kali terhubung ke Activity.
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach")
    }

    // Dipanggil untuk melakukan inisialisasi awal pada fragment.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        // Bagian 'arguments?.let' dari template bisa kita abaikan untuk saat ini
    }

    // Dipanggil untuk membuat dan mengembalikan tampilan (View) yang terkait dengan fragment.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView")
        // Baris ini penting untuk menghubungkan file layout fragment_main.xml
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    // Dipanggil setelah onCreateView selesai. Di sini kita bisa mengakses View.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")
    }

    // Dipanggil saat fragment tidak lagi berinteraksi dengan pengguna.
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    // Dipanggil saat fragment tidak lagi terlihat oleh pengguna.
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    // Dipanggil saat tampilan yang dibuat di onCreateView akan dihancurkan.
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
    }

    // Dipanggil saat fragment akan dihancurkan.
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    // Dipanggil saat fragment dilepaskan dari Activity.
    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach")
    }

    // Di sinilah kita mendeklarasikan 'TAG' agar tidak error
    companion object {
        private const val TAG = "MainFragment"
    }
}