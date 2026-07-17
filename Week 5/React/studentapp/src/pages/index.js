import Head from "next/head";
import Image from "next/image";
import { Geist, Geist_Mono } from "next/font/google";
import styles from "@/styles/Home.module.css";
import Home from "@/components/Home";
import About from "@/components/About";
import Contact from "@/components/Contact";

const geistSans = Geist({
  variable: "--font-geist-sans",
  subsets: ["latin"],
});

const geistMono = Geist_Mono({
  variable: "--font-geist-mono",
  subsets: ["latin"],
});

export default function App() {
  return (
    <>
      <section>
        <Home />
        <About />
        <Contact />
      </section>
    </>
  );
}
