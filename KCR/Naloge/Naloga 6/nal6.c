#include <gtk/gtk.h>
#include <stdlib.h>
#include <string.h>

GtkBuilder *builder;
GtkWidget *window;

int main(int argc, char *argv[]){
	gtk_init(&argc, &argv);
	builder = gtk_builder_new();
	gtk_builder_add_from_file(builder, "6nal.glade", NULL);
	window = GTK_WIDGET(gtk_builder_get_object(builder, "window1"));
	gtk_builder_connect_signals(builder, NULL);
	gtk_widget_show(window);
	gtk_main();
	return 0;
}
