package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object disambiguatingDescription extends PropertyDef(
        iri = "https://schema.org/disambiguatingDescription",
        iris = Set("https://schema.org/disambiguatingDescription"),
        label = "disambiguatingDescription",
        comment = """A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.""",
        `@extends` = () => List(description),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.description.Properties
}