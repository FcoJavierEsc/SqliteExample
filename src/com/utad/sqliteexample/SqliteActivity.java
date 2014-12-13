package com.utad.sqliteexample;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.sqliteexample.R;

public class SqliteActivity extends FragmentActivity implements LoaderCallbacks<Cursor> {
	SimpleCursorAdapter mDatos = null ;//new SimpleCursorAdapter(null, null, from, to) 
	ListView mLv ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sqlite);


		String dbPath = null;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
			dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
		} else {
			dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
		}
		
		File dbFile = new File(dbPath);
		
		if (!dbFile.exists()) {
			this.getReadableDatabase();
			this.close();
			try {
				InputStream is = context.getAssets().open(DB + ".sql");
				OutputStream os = new FileOutputStream(dbPath);
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer)) > 0) {
					os.write(buffer, 0, read);
				}
				os.flush();
				os.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		String dbPath = null;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
			dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
		} else {
			dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
		}
		
		File dbFile = new File(dbPath);
		
		if (!dbFile.exists()) {
			this.getReadableDatabase();
			this.close();
			try {
				InputStream is = context.getAssets().open(DB + ".sql");
				OutputStream os = new FileOutputStream(dbPath);
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer)) > 0) {
					os.write(buffer, 0, read);
				}
				os.flush();
				os.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		String dbPath = null;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
			dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
		} else {
			dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
		}
		
		File dbFile = new File(dbPath);
		
		if (!dbFile.exists()) {
			this.getReadableDatabase();
			this.close();
			try {
				InputStream is = context.getAssets().open(DB + ".sql");
				OutputStream os = new FileOutputStream(dbPath);
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer)) > 0) {
					os.write(buffer, 0, read);
				}
				os.flush();
				os.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		String dbPath = null;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
			dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
		} else {
			dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
		}
		
		File dbFile = new File(dbPath);
		
		if (!dbFile.exists()) {
			this.getReadableDatabase();
			this.close();
			try {
				InputStream is = context.getAssets().open(DB + ".sql");
				OutputStream os = new FileOutputStream(dbPath);
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer)) > 0) {
					os.write(buffer, 0, read);
				}
				os.flush();
				os.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		String dbPath = null;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
			dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
		} else {
			dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
		}
		
		File dbFile = new File(dbPath);
		
		if (!dbFile.exists()) {
			this.getReadableDatabase();
			this.close();
			try {
				InputStream is = context.getAssets().open(DB + ".sql");
				OutputStream os = new FileOutputStream(dbPath);
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer)) > 0) {
					os.write(buffer, 0, read);
				}
				os.flush();
				os.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		String dbPath = null;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
			dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
		} else {
			dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
		}
		
		File dbFile = new File(dbPath);
		
		if (!dbFile.exists()) {
			this.getReadableDatabase();
			this.close();
			try {
				InputStream is = context.getAssets().open(DB + ".sql");
				OutputStream os = new FileOutputStream(dbPath);
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer)) > 0) {
					os.write(buffer, 0, read);
				}
				os.flush();
				os.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		String dbPath = null;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
			dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
		} else {
			dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
		}
		
		File dbFile = new File(dbPath);
		
		if (!dbFile.exists()) {
			this.getReadableDatabase();
			this.close();
			try {
				InputStream is = context.getAssets().open(DB + ".sql");
				OutputStream os = new FileOutputStream(dbPath);
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer)) > 0) {
					os.write(buffer, 0, read);
				}
				os.flush();
				os.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		String dbPath = null;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
			dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
		} else {
			dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
		}
		
		File dbFile = new File(dbPath);
		
		if (!dbFile.exists()) {
			this.getReadableDatabase();
			this.close();
			try {
				InputStream is = context.getAssets().open(DB + ".sql");
				OutputStream os = new FileOutputStream(dbPath);
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer)) > 0) {
					os.write(buffer, 0, read);
				}
				os.flush();
				os.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		String dbPath = null;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
			dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
		} else {
			dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
		}
		
		File dbFile = new File(dbPath);
		
		if (!dbFile.exists()) {
			this.getReadableDatabase();
			this.close();
			try {
				InputStream is = context.getAssets().open(DB + ".sql");
				OutputStream os = new FileOutputStream(dbPath);
				byte[] buffer = new byte[1024];
				int read;
				while ((read = is.read(buffer)) > 0) {
					os.write(buffer, 0, read);
				}
				os.flush();
				os.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
//		}r (int i=3;i<200;i++){
//		insertValues.put("_id", i);
//		insertValues.put("Nombre", "Fernando"+i);
//		getContentResolver().insert(MiContentProvider.CONTENT_URI, insertValues);
//		}
//		
		LoaderManager loadManager = getSupportLoaderManager();
		
		Loader loader = loadManager.initLoader(0, null,  this);
		

		 mLv = (ListView) findViewById(R.id.item_list_view_id);
        
	

    mLv.setAdapter(mDatos);

		//adapter

		mLv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
                    // que hacer
			}
			
		});
	
	//	c.close();
		//db.close();
	}

	@Override
	public Loader<Cursor> onCreateLoader(int arg0, Bundle arg1) {
		
		mDatos = new SimpleCursorAdapter(this, 
				android.R.layout.simple_list_item_1,
				null,
				new  String[]{MiContentProvider.PERSON_NAME},
				new int[]{android.R.id.text1}, 
				SimpleCursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
		
		return new CursorLoader(this, MiContentProvider.CONTENT_URI, new String[] { "_id",
				"Nombre" }, null, null, "_id");
	}

	@Override
	public void onLoadFinished(Loader<Cursor> arg0, Cursor c) {

		mDatos.swapCursor(c);
		
		//while (c.moveToNext()) {
	//		Log.v("VAMOS", "_id" + c.getInt(0) + "Nombre" + c.getString(1));
	//	}
		// Cursor c = db.query("PRUEBA", new String[] { "_id,Nombre" }, null,
		// null, null, null, "_id");
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {
		// TODO Auto-generated method stub

	}

}
