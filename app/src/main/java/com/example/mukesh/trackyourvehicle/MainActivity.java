package com.example.mukesh.trackyourvehicle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

 private MainFragmentOrganizer frag_organizer;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  frag_organizer = new MainFragmentOrganizer(getSupportFragmentManager());
 }


 public MainFragmentOrganizer getFrag_organizer() {
  return frag_organizer;
 }

 @Override
 public void onBackPressed() {
  handleBackPressed();
 }

 private void handleBackPressed() {
  if(!getFrag_organizer().handleBackNavigation()){
   finish();
  }
 }
}
