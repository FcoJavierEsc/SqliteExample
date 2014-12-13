package com.utad.sqliteexample;

import com.example.sqliteexample.R;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBarActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class SqliteActivity extends FragmentActivity implements LoaderCallbacks<Cursor> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sqlite);

	//	SQLiteOpenHelper helper = new MiSqliteOpenHelper(this, "PruebaDB",null, 1);
	//	SQLiteDatabase db = helper.getWritableDatabase();

		ContentValues insertValues = new ContentValues();

//		for (int i=3;i<200;i++){
//		insertValues.put("_id", i);
//		insertValues.put("Nombre", "Fernando"+i);
//		db.insert("PRUEBA", null, insertValues);
//		}
		
		LoaderManager loadManager = getSupportLoaderManager();
		
		Loader loader = loadManager.initLoader(0, null,  this);
		


	
	//	c.close();
		//db.close();
	}

	@Override
	public Loader<Cursor> onCreateLoader(int arg0, Bundle arg1) {
		return new CursorLoader(this, MiContentProvider.CONTENT_URI, new String[] { "_id",
				"Nombre" }, null, null, "_id");
	}

	@Override
	public void onLoadFinished(Loader<Cursor> arg0, Cursor c) {

		while (c.moveToNext()) {
			Log.v("VAMOS", "_id" + c.getInt(0) + "Nombre" + c.getString(1));
		}
		// Cursor c = db.query("PRUEBA", new String[] { "_id,Nombre" }, null,
		// null, null, null, "_id");
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {
		// TODO Auto-generated method stub

	}

}
