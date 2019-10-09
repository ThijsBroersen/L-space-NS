package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MenuItem extends OntologyDef(
        iri = "http://schema.org/MenuItem",
        iris = Set("http://schema.org/MenuItem"),
        label = "MenuItem",
        comment = """A food or drink item listed in a menu or menu section.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val menuAddOn = lspace.ns.vocab.schema.menuAddOn.property
lazy val nutrition = lspace.ns.vocab.schema.nutrition.property
lazy val offers = lspace.ns.vocab.schema.offers.property
lazy val suitableForDiet = lspace.ns.vocab.schema.suitableForDiet.property
}
override lazy val properties: List[LProperty] = List(menuAddOn, nutrition, offers, suitableForDiet)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val menuAddOn = lspace.ns.vocab.schema.menuAddOn.property
lazy val nutrition = lspace.ns.vocab.schema.nutrition.property
lazy val offers = lspace.ns.vocab.schema.offers.property
lazy val suitableForDiet = lspace.ns.vocab.schema.suitableForDiet.property
}
}