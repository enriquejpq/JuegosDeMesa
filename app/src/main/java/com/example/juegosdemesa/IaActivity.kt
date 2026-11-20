<?xml version="1.0" encoding="utf-8"?>
<!-- Pantalla de recomendación con IA -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:id="@+id/main"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
tools:context=".IaActivity">

<!-- Parte de arriba: lo que escribe la persona -->
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="vertical"
android:padding="24dp"
android:paddingBottom="0dp">

<!-- Barra con el título y el botón volver -->
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal"
android:gravity="center_vertical">

<TextView
android:id="@+id/txtTituloIA"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:layout_weight="1"
android:text="@string/ia_titulo"
style="@style/EstiloTitulo" />

<ImageButton
android:id="@+id/btnVolverIA"
android:layout_width="48dp"
android:layout_height="48dp"
android:src="@android:drawable/ic_menu_revert"
android:background="@android:color/transparent"
app:tint="@color/primario"
android:contentDescription="@string/desc_btn_volver" />
</LinearLayout>

<!-- Subtítulo -->
<TextView
android:id="@+id/txtSubtituloIA"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="4dp"
android:text="@string/ia_subtitulo"
style="@style/EstiloSubtitulo" />

<!-- Pregunta -->
<TextView
android:id="@+id/txtPreguntaIA"
style="@style/EstiloEtiqueta"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="@string/ia_pregunta" />

<!-- Campo donde la persona escribe su pregunta -->
<EditText
android:id="@+id/edtPreguntaIA"
style="@style/EstiloCampo"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="@string/hint_pregunta_ia"
android:inputType="textMultiLine"
android:minLines="2"
android:gravity="top"
android:importantForAutofill="no" />

<!-- Botón para preguntar a la IA -->
<Button
android:id="@+id/btnPreguntarIA"
style="@style/EstiloBoton"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_marginTop="16dp"
android:text="@string/btn_preguntar_ia" />

<!-- Texto "Recomendación" -->
<TextView
android:id="@+id/txtEtiquetaRespuestaIA"
style="@style/EstiloEtiqueta"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="@string/ia_etiqueta_respuesta" />

</LinearLayout>

<!-- Área de respuesta: se puede deslizar si es larga -->
<ScrollView
android:layout_width="match_parent"
android:layout_height="0dp"
android:layout_weight="1"
android:layout_marginStart="24dp"
android:layout_marginEnd="24dp"
android:layout_marginBottom="24dp"
android:layout_marginTop="8dp"
android:background="@color/fondo_tarjeta">

<!-- Aquí se muestra la respuesta (por ahora es un ejemplo) -->
<TextView
android:id="@+id/txtRespuestaIA"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:padding="16dp"
android:lineSpacingExtra="4sp"
android:text="@string/ia_respuesta_ejemplo"
android:textSize="16sp"
android:textColor="@color/texto_principal" />
</ScrollView>

</LinearLayout>
