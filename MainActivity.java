<?xml version="1.0" encoding="utf-8"?>
<androidx.appcompat.widget.LinearLayoutCompat xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/btnSaludar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/colorPrimary"
        android:text="@string/btnsaludar"
        android:textColor="@android:color/white"
        android:onClick="showToast"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="5dp" />

    <Button
        android:id="@+id/btnContador"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/colorPrimary"
        android:onClick="contador"
        android:text="@string/contador"
        android:textColor="@android:color/white"
        app:layout_constraintBottom_toBottomOf="parent"
        tools:layout_editor_absoluteX="28dp" />

    <TextView
        android:id="@+id/show_count"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:background="?android:attr/colorActivatedHighlight"
        android:gravity="center_horizontal|center_vertical"
        android:text="0"

        android:textSize="160sp"
        app:layout_constraintBottom_toTopOf="@+id/btnContador"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent" />

</androidx.appcompat.widget.LinearLayoutCompat>
