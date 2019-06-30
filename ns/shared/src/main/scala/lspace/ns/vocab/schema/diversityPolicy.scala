package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object diversityPolicy extends PropertyDef(
        iri = "http://schema.org/diversityPolicy",
        iris = Set("http://schema.org/diversityPolicy"),
        label = "diversityPolicy",
        comment = """Statement on diversity policy by an <a class="localLink" href="http://schema.org/Organization">Organization</a> e.g. a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>. For a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a>, a statement describing the newsroom’s diversity policy on both staffing and sources, typically providing staffing data.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, CreativeWork.ontology)
       ){
}