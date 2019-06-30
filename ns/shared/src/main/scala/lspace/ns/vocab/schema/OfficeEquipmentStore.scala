package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OfficeEquipmentStore extends OntologyDef(
        iri = "http://schema.org/OfficeEquipmentStore",
        iris = Set("http://schema.org/OfficeEquipmentStore"),
        label = "OfficeEquipmentStore",
        comment = """An office equipment store.""",
        `@extends` = () => List(Store.ontology)
       ){
}