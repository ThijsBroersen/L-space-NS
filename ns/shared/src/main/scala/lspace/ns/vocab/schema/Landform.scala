package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Landform extends OntologyDef(
        iri = "http://schema.org/Landform",
        iris = Set("http://schema.org/Landform"),
        label = "Landform",
        comment = """A landform or physical feature.  Landform elements include mountains, plains, lakes, rivers, seascape and oceanic waterbody interface features such as bays, peninsulas, seas and so forth, including sub-aqueous terrain features such as submersed mountain ranges, volcanoes, and the great ocean basins.""",
        `@extends` = () => List(Place.ontology)
       ){
}